package com.onexy.crm.entity;

public class Menu {
    private Long id;

    private String sn;

    private String name;

    private String icon;

    private String url;

    private String intro;

    private Long parentId;

    public Menu(Long id, String sn, String name, String icon, String url, String intro, Long parentId) {
        this.id = id;
        this.sn = sn;
        this.name = name;
        this.icon = icon;
        this.url = url;
        this.intro = intro;
        this.parentId = parentId;
    }

    public Long getId() {
        return id;
    }

    public String getSn() {
        return sn;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getUrl() {
        return url;
    }

    public String getIntro() {
        return intro;
    }

    public Long getParentId() {
        return parentId;
    }
}