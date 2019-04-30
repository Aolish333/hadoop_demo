import junit.framework.TestCase;

/**
 * @author aolish333@gmail.com
 * @date 2019/4/29 11:29
 * User:Lee
 */
public class OperFileTest extends TestCase {
    public void testGetDirectoryFromHdfs() throws Exception {
        OperFile.getDirectoryFromHdfs("/");
    }

    public void testRename() throws Exception {
        OperFile.rename("/test","/newTest");
    }

    public void testUploadFile() throws Exception {
        OperFile.uploadFile("h:/pic.jpg","/input/");
    }

    public void testDelete() throws Exception {
        OperFile.delete("/test1");
    }

    public void testMkdir() throws Exception {
        OperFile.mkdir("/test1");
    }

    public void testReadFile() throws Exception {
        OperFile.readFile("/input/pic.jpg");
    }
    
}