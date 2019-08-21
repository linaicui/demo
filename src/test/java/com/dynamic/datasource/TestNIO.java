package com.dynamic.datasource;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/7/16
 **/
public class TestNIO {
    @Test
    public void test1(){
        StringBuffer str = new StringBuffer("abcde");
        ByteBuffer buf = ByteBuffer.allocate(1024);

        System.out.println("========allcocate==========");
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        System.out.println("========put==========");
        buf.put(str.toString().getBytes());
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        System.out.println("========flip==========");
        buf.flip();
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        System.out.println("========get==========");
        byte[] bytes = new byte[str.length()];
        buf.get(bytes);
        System.out.println(new String(bytes));
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        System.out.println("========rewind==========");
        buf.rewind();
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        System.out.println("========clear==========");
        buf.clear();
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());
        System.out.println((char)buf.get());
    }

    @Test
    public void test2()throws Exception{
        File file = new File("D:\\1.jpg");
        File file2 = new File("D:\\3.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream(file2);
        byte[] bytes=new byte[1024];
        while (inputStream.read(bytes,0,bytes.length)!=-1){
            outputStream.write(bytes);
        }

        //获取通道
//        FileChannel inchannel = inputStream.getChannel();
//        FileChannel outchannel = outputStream.getChannel();
//        //获取缓冲区
//        ByteBuffer buf = ByteBuffer.allocate(1024);
//
//        while (inchannel.read(buf)!=-1){
//            buf.flip();
//            outchannel.write(buf);
//            buf.clear();
//        }
//        inchannel.close();
//        outchannel.close();
        inputStream.close();
        outputStream.close();

    }

    @Test
    public void test3()throws Exception{
        FileChannel inChannel = FileChannel.open(Paths.get("D:\\1.jpg"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("D:\\2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption
                .CREATE);
        MappedByteBuffer inMapbuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outMapbuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        byte[] dst=new byte[inMapbuffer.limit()];
        inMapbuffer.get(dst);
        outMapbuffer.put(dst);
        inChannel.close();
        outChannel.close();
    }

    @Test
    public void test4()throws Exception{
        FileChannel inChannel = FileChannel.open(Paths.get("D:\\1.jpg"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("D:\\999.jpg"), StandardOpenOption.WRITE,
                StandardOpenOption.READ, StandardOpenOption
                .CREATE);
        inChannel.transferTo(0,inChannel.size(),outChannel);
    }
}
