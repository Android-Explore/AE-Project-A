package info.leftpi.model;

import java.io.Serializable;

/**
 * Created by zhaochunyu on 15/11/20.
 */
public class TopicModel implements Serializable {

    private int id;
    private String title;
    private String url;
    private String content;
    private String content_rendered;

    private int replies;
    private MemberModel member;
    private NodeModel node;
    private long created;
    private long last_modified;

    private long last_touched;
}
