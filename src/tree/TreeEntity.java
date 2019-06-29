package tree;

import java.util.List;

/**
 * Created by gengtao on 2019/5/29.
 */
public class TreeEntity {
    private String id;

    private List<TreeEntity> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TreeEntity> getChildren() {
        return children;
    }

    public void setChildren(List<TreeEntity> children) {
        this.children = children;
    }

    public TreeEntity(String id, List<TreeEntity> children) {
        this.id = id;
        this.children = children;
    }

    public TreeEntity() {
    }

    public TreeEntity(String id) {
        this.id = id;
    }
}
