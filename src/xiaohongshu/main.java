package xiaohongshu;

import com.google.gson.Gson;
import org.apache.http.util.TextUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<XiaoHongShuModel.DataEntity.NotesEntity> list = new ArrayList<>();
        Gson gson = new Gson();
        list.addAll(getListForJson(XiaoHongShuJSON.xhsJson1, gson));
        list.addAll(getListForJson(XiaoHongShuJSON.xhsJson2, gson));
        ;
        list.addAll(getListForJson(XiaoHongShuJSON.xhsJson3, gson));
        list.addAll(getListForJson(XiaoHongShuJSON.xhsJson4, gson));
        list.addAll(getListForJson(XiaoHongShuJSON.xhsJson5, gson));
        list.addAll(getListForJson(XiaoHongShuJSON.xhsJson6, gson));
        list.addAll(getListForJson(XiaoHongShuJSON.xhsJson7, gson));
        NotesModel model = new NotesModel();
        List<NotesModel.AllEntity> allEntityList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            allEntityList.add(listToJson(list.get(i)));

        }

        model.setAll(allEntityList);
        String notesJson = gson.toJson(model);
        saveDataToFile("notes_data.json", notesJson);
        System.out.println("总数有" + list.size());
        NotesModel.AllEntity entity =listToJson(list.get(0));

        String notesJson2 = gson.toJson(entity);
        saveDataToFile("notes_data2.json", notesJson2);
    }

    public static NotesModel.AllEntity listToJson(XiaoHongShuModel.DataEntity.NotesEntity notesEntity) {
        NotesModel.AllEntity entity = new NotesModel.AllEntity();
        entity.setDesc(notesEntity.getDesc());
        List<NotesModel.AllEntity.Images_listEntity> images_list = new ArrayList<>();
        if (notesEntity.getImages_list() != null) {
            for (int i = 0; i < notesEntity.getImages_list().size(); i++) {
                NotesModel.AllEntity.Images_listEntity images_listEntity = new NotesModel.AllEntity.Images_listEntity();
                images_listEntity.setFileid(notesEntity.getImages_list().get(i).getFileid());
                images_listEntity.setHeight(notesEntity.getImages_list().get(i).getHeight());
                images_listEntity.setOriginal(notesEntity.getImages_list().get(i).getOriginal());
                images_listEntity.setUrl(notesEntity.getImages_list().get(i).getUrl());
                images_listEntity.setUrl_size_large(notesEntity.getImages_list().get(i).getUrl_size_large());
                images_listEntity.setWidth(notesEntity.getImages_list().get(i).getWidth());
                images_list.add(images_listEntity);
            }
        }
        entity.setImages_list(images_list);
        entity.setIs_ads(notesEntity.isIs_ads());
        entity.setLiked(notesEntity.isLiked());
        entity.setLiked_count(notesEntity.getLiked_count());
        if(notesEntity.getUser()!=null) {
            NotesModel.AllEntity.UserEntity userEntity = new NotesModel.AllEntity.UserEntity();
            userEntity.setImages(notesEntity.getUser().getImages());
            userEntity.setNickname(notesEntity.getUser().getNickname());
            userEntity.setUserid(notesEntity.getUser().getUserid());
            entity.setUser(userEntity);
        }
        if (TextUtils.isEmpty(notesEntity.getTitle())) {
            entity.setTitle(notesEntity.getDesc());
        } else {
            entity.setTitle(notesEntity.getTitle());
        }
        System.out.println("   title:" + notesEntity.getTitle());
        return entity;
    }

    public static List<XiaoHongShuModel.DataEntity.NotesEntity> getListForJson(String fileName, Gson gson) {
        String path = main.class.getClassLoader().getResource(fileName).getPath();
        String json = readJsonFile(path);
        XiaoHongShuModel model = gson.fromJson(json, XiaoHongShuModel.class);
        System.out.println(model.getData().getNotes().get(0).getTitle());
        return model.getData().getNotes();
    }

    /**
     * 读取json文件，返回json串
     *
     * @param fileName
     * @return
     */
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);

            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * //保存数据
     *
     * @param fileName 文件名称
     * @param data     json字符串
     */
    public static void saveDataToFile(String fileName, String data) {
        BufferedWriter writer = null;
        String destDirName = "E:\\workspace\\ScrapyDemo\\resources";
        File dir = new File(destDirName);
        if (dir.exists()) {
            System.out.println("创建目录" + destDirName + "失败，目标目录已经存在");
        }
        if (!destDirName.endsWith(File.separator)) {
            destDirName = destDirName + File.separator;
        }
        //创建目录
        if (dir.mkdirs()) {
            System.out.println("创建目录" + destDirName + "成功！");
        } else {
            System.out.println("创建目录" + destDirName + "失败！");
        }
        File file = new File(destDirName + fileName );
        System.out.println(file + "file");
        //如果文件不存在，则新建一个
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(fileName + "文件不存在");
        }
        //写入
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, false), "UTF-8"));
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件写入成功！");
    }

}