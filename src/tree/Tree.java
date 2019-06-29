package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gengtao on 2019/5/29.
 */
public class Tree {



    public static void main(String[] args) {
        /*String tree = ("{\"data\":[{\"id\":\"1\",\"children\":[{\"id\":\"11\",\"children\":{\"id\":\"111\"}},{\"id\":\"12\",\"children\":{\"id\":\"121\"}}]},{\"id\":\"2\",\"children\":[{\"id\":\"21\",\"children\":{\"id\":\"211\"}},{\"id\":\"22\",\"children\":{\"id\":\"221\"}}]}]}");
        JSONObject jsonobject = JSONObject.parseObject(tree);
        JSONObject js = new JSONObject();
        JSONArray entityList = jsonobject.getJSONArray("data");
        for(int i = 0; i < entityList.size(); i++){
            TreeEntity entity = JSON.parseObject(String.valueOf(entityList.get(i)),TreeEntity.class);
            toPrint(entity);
        }*/

        TreeEntity treeEntity111 = new TreeEntity("111");
        List<TreeEntity> list11 = new ArrayList<>();
        list11.add(treeEntity111);
        TreeEntity treeEntity112 = new TreeEntity("112");
        list11.add(treeEntity112);
        TreeEntity treeEntity11 = new TreeEntity("11",list11);

        TreeEntity treeEntity121 = new TreeEntity("121");
        List<TreeEntity> list12 = new ArrayList<>();
        list12.add(treeEntity121);
        TreeEntity treeEntity12 = new TreeEntity("12",list12);

        List<TreeEntity> list1 = new ArrayList<>();
        list1.add(treeEntity11);
        list1.add(treeEntity12);

        TreeEntity treeEntity1 = new TreeEntity("1", list1);

        toPrint(treeEntity1);
        System.out.println(1111);
    }

    public static void toPrint(TreeEntity entity){//
        System.out.println("<div>"+entity.getId());;
       if(null != entity.getChildren()){
           for(TreeEntity entity1 : entity.getChildren()){
               toPrint(entity1);
           }

       }
       System.out.println("</div>");;



    }
}
