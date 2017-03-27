package me.springframework.core.reource;

import org.junit.Test;
import org.springframework.core.io.*;

import java.io.*;

/**
 * @author Kevin
 * @description
 * @date 2017/3/27
 */
public class SpringResourceTest {

    @Test
    public void testUrlResource() throws IOException {
        UrlResource resource = new UrlResource("http://www.baidu.com");
        if (resource.isReadable()) {
            // URLConnection对应的getInputStream()
            printContent(resource.getInputStream());
        }
    }

    @Test
    public void testClassPathResource() throws IOException {
        ClassPathResource resource = new ClassPathResource("springResource.xml");
        String fileName = resource.getDescription();
        System.out.println(fileName);

        if (resource.isReadable()) {
            // 每次都会打开一个新的流
            InputStream is = resource.getInputStream();
            this.printContent(is);
        }
    }

    @Test
    public void testFileSystemResource() throws IOException {
        FileSystemResource resource = new FileSystemResource("D:\\tmp\\test.txt");
        if (resource.isReadable()) {
            // FileInputStream
            printContent(resource.getInputStream());
        }
        if (resource.isWritable()) {
            // 每次都会获取到一个新的输出流
            OutputStream os = resource.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
            bw.write("FileSystemResource实现类测试。");
            bw.flush();
            if (os != null) {
                os.close();
            }
            if (bw != null) {
                bw.close();
            }
        }
    }

    @Test
    public void testByteArrayResource() throws IOException {
        ByteArrayResource resource = new ByteArrayResource("HelloWorld".getBytes());
        if (resource.isReadable()) {
            printContent(resource.getInputStream());
        }
    }

    @Test
    public void testInputStreamResource() throws IOException {
        InputStream is = new FileInputStream("D:\\tmp\\test.txt");
        InputStreamResource resource = new InputStreamResource(is);
        if (resource.isReadable()) {
            printContent(resource.getInputStream());
        }
    }

    /**
     * 打印输入流内容
     *
     * @param is
     * @throws IOException
     */
    private void printContent(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        if (is != null) {
            is.close();
        }
        if (br != null) {
            br.close();
        }
    }

}
