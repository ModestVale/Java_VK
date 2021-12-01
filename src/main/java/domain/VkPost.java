package domain;

import java.util.Date;

public class VkPost {
    private String title;
    private String text;
    private Date creationTime;
    private int likesCount;
    private int viewsCount;
    private int repostCount;
    private int id;
    private int ownerId;
    private int authorId;
    private int approuverId;
    private CommentsInfo[] comments;
    private AttachmentsInfo[] attachments;

}
