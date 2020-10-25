package adminclient;

public class FileInfo {
    private String name;
    private String code;
    private String uploader;
    private int downloadsRemaining;
    private String deletionTimestamp;

    public FileInfo(String name, String code, String uploader, int downloadsRemaining, String deletionTimestamp) {
        this.name = name;
        this.code = code;
        this.uploader = uploader;
        this.downloadsRemaining = downloadsRemaining;
        this.deletionTimestamp = deletionTimestamp;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getUploader() {
        return this.uploader;
    }

    public int getDownloadsRemaining() {
        return this.downloadsRemaining;
    }

    public String getDeletionTimestamp() {
        return this.deletionTimestamp;
    }
}