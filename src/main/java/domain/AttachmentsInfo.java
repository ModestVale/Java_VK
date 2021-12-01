package domain;

public class AttachmentsInfo {
    private int id;
    private int postId;
    private int authorId;
    private String content;
    private String title;
    private AttachmentType type;

    enum AttachmentType {
        photo,
        video,
        link
    }
}


