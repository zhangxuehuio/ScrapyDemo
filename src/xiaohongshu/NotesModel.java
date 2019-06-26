package xiaohongshu;

import java.util.List;

public class NotesModel {


    /**
     * all : [{"liked_count":66728,"is_ads":false,"title":"史上最全🔥李佳琦OMG的口红\u203c️超赞超好看\u203c️","images_list":[{"original":"http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c","width":1024,"url_size_large":"http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c?imageView2/2/w/540/format/jpg","fileid":"81c0306b-ff71-55ee-be40-476c3f41be0c","height":1280},{"original":"http://ci.xiaohongshu.com/9da9f8e4-e80b-5423-b784-8dcd6f17a441","width":1024,"url_size_large":"http://ci.xiaohongshu.com/9da9f8e4-e80b-5423-b784-8dcd6f17a441?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/9da9f8e4-e80b-5423-b784-8dcd6f17a441?imageView2/2/w/540/format/jpg","fileid":"9da9f8e4-e80b-5423-b784-8dcd6f17a441","height":1280},{"original":"http://ci.xiaohongshu.com/5ba31043-b7e7-564d-a4fb-2ade636471e7","width":1024,"url_size_large":"http://ci.xiaohongshu.com/5ba31043-b7e7-564d-a4fb-2ade636471e7?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/5ba31043-b7e7-564d-a4fb-2ade636471e7?imageView2/2/w/540/format/jpg","fileid":"5ba31043-b7e7-564d-a4fb-2ade636471e7","height":1280},{"original":"http://ci.xiaohongshu.com/9f07fbe3-bf60-57df-96a7-a16e8fe5add4","width":1024,"url_size_large":"http://ci.xiaohongshu.com/9f07fbe3-bf60-57df-96a7-a16e8fe5add4?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/9f07fbe3-bf60-57df-96a7-a16e8fe5add4?imageView2/2/w/540/format/jpg","fileid":"9f07fbe3-bf60-57df-96a7-a16e8fe5add4","height":1280},{"original":"http://ci.xiaohongshu.com/bfd2bacf-014d-5c31-b726-9e6a270e5b66","width":1024,"url_size_large":"http://ci.xiaohongshu.com/bfd2bacf-014d-5c31-b726-9e6a270e5b66?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/bfd2bacf-014d-5c31-b726-9e6a270e5b66?imageView2/2/w/540/format/jpg","fileid":"bfd2bacf-014d-5c31-b726-9e6a270e5b66","height":1280},{"original":"http://ci.xiaohongshu.com/9facefef-30e6-55a5-b687-a4dcb7ff74d5","width":1024,"url_size_large":"http://ci.xiaohongshu.com/9facefef-30e6-55a5-b687-a4dcb7ff74d5?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/9facefef-30e6-55a5-b687-a4dcb7ff74d5?imageView2/2/w/540/format/jpg","fileid":"9facefef-30e6-55a5-b687-a4dcb7ff74d5","height":1280}],"user":{"images":"https://img.xiaohongshu.com/avatar/5cdfde7ed756b600012de657.jpg@80w_80h_90q_1e_1c_1x.jpg","nickname":"优优xxi","red_official_verify_type":0,"red_official_verified":false,"userid":"56d6de22aed75858e168d428"},"liked":false,"desc":"熬夜吐血整理，李佳琦推荐口红清单合集，不得不说，李佳琦是口红种草机，春夏zui适合小仙.女涂的口红，给大家理性种草口红一"}]
     */
    private List<AllEntity> all;

    public void setAll(List<AllEntity> all) {
        this.all = all;
    }

    public List<AllEntity> getAll() {
        return all;
    }

    public static class AllEntity {
        /**
         * liked_count : 66728
         * is_ads : false
         * title : 史上最全🔥李佳琦OMG的口红‼️超赞超好看‼️
         * images_list : [{"original":"http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c","width":1024,"url_size_large":"http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c?imageView2/2/w/540/format/jpg","fileid":"81c0306b-ff71-55ee-be40-476c3f41be0c","height":1280},{"original":"http://ci.xiaohongshu.com/9da9f8e4-e80b-5423-b784-8dcd6f17a441","width":1024,"url_size_large":"http://ci.xiaohongshu.com/9da9f8e4-e80b-5423-b784-8dcd6f17a441?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/9da9f8e4-e80b-5423-b784-8dcd6f17a441?imageView2/2/w/540/format/jpg","fileid":"9da9f8e4-e80b-5423-b784-8dcd6f17a441","height":1280},{"original":"http://ci.xiaohongshu.com/5ba31043-b7e7-564d-a4fb-2ade636471e7","width":1024,"url_size_large":"http://ci.xiaohongshu.com/5ba31043-b7e7-564d-a4fb-2ade636471e7?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/5ba31043-b7e7-564d-a4fb-2ade636471e7?imageView2/2/w/540/format/jpg","fileid":"5ba31043-b7e7-564d-a4fb-2ade636471e7","height":1280},{"original":"http://ci.xiaohongshu.com/9f07fbe3-bf60-57df-96a7-a16e8fe5add4","width":1024,"url_size_large":"http://ci.xiaohongshu.com/9f07fbe3-bf60-57df-96a7-a16e8fe5add4?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/9f07fbe3-bf60-57df-96a7-a16e8fe5add4?imageView2/2/w/540/format/jpg","fileid":"9f07fbe3-bf60-57df-96a7-a16e8fe5add4","height":1280},{"original":"http://ci.xiaohongshu.com/bfd2bacf-014d-5c31-b726-9e6a270e5b66","width":1024,"url_size_large":"http://ci.xiaohongshu.com/bfd2bacf-014d-5c31-b726-9e6a270e5b66?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/bfd2bacf-014d-5c31-b726-9e6a270e5b66?imageView2/2/w/540/format/jpg","fileid":"bfd2bacf-014d-5c31-b726-9e6a270e5b66","height":1280},{"original":"http://ci.xiaohongshu.com/9facefef-30e6-55a5-b687-a4dcb7ff74d5","width":1024,"url_size_large":"http://ci.xiaohongshu.com/9facefef-30e6-55a5-b687-a4dcb7ff74d5?imageView2/2/w/1080/format/jpg","url":"http://ci.xiaohongshu.com/9facefef-30e6-55a5-b687-a4dcb7ff74d5?imageView2/2/w/540/format/jpg","fileid":"9facefef-30e6-55a5-b687-a4dcb7ff74d5","height":1280}]
         * user : {"images":"https://img.xiaohongshu.com/avatar/5cdfde7ed756b600012de657.jpg@80w_80h_90q_1e_1c_1x.jpg","nickname":"优优xxi","red_official_verify_type":0,"red_official_verified":false,"userid":"56d6de22aed75858e168d428"}
         * liked : false
         * desc : 熬夜吐血整理，李佳琦推荐口红清单合集，不得不说，李佳琦是口红种草机，春夏zui适合小仙.女涂的口红，给大家理性种草口红一
         */
        private int liked_count;
        private boolean is_ads;
        private String title;
        private List<Images_listEntity> images_list;
        private UserEntity user;
        private boolean liked;
        private String desc;

        public void setLiked_count(int liked_count) {
            this.liked_count = liked_count;
        }

        public void setIs_ads(boolean is_ads) {
            this.is_ads = is_ads;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImages_list(List<Images_listEntity> images_list) {
            this.images_list = images_list;
        }

        public void setUser(UserEntity user) {
            this.user = user;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getLiked_count() {
            return liked_count;
        }

        public boolean isIs_ads() {
            return is_ads;
        }

        public String getTitle() {
            return title;
        }

        public List<Images_listEntity> getImages_list() {
            return images_list;
        }

        public UserEntity getUser() {
            return user;
        }

        public boolean isLiked() {
            return liked;
        }

        public String getDesc() {
            return desc;
        }

        public static class Images_listEntity {
            /**
             * original : http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c
             * width : 1024
             * url_size_large : http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c?imageView2/2/w/1080/format/jpg
             * url : http://ci.xiaohongshu.com/81c0306b-ff71-55ee-be40-476c3f41be0c?imageView2/2/w/540/format/jpg
             * fileid : 81c0306b-ff71-55ee-be40-476c3f41be0c
             * height : 1280
             */
            private String original;
            private int width;
            private String url_size_large;
            private String url;
            private String fileid;
            private int height;

            public void setOriginal(String original) {
                this.original = original;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public void setUrl_size_large(String url_size_large) {
                this.url_size_large = url_size_large;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setFileid(String fileid) {
                this.fileid = fileid;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getOriginal() {
                return original;
            }

            public int getWidth() {
                return width;
            }

            public String getUrl_size_large() {
                return url_size_large;
            }

            public String getUrl() {
                return url;
            }

            public String getFileid() {
                return fileid;
            }

            public int getHeight() {
                return height;
            }
        }

        public static class UserEntity {
            /**
             * images : https://img.xiaohongshu.com/avatar/5cdfde7ed756b600012de657.jpg@80w_80h_90q_1e_1c_1x.jpg
             * nickname : 优优xxi
             * red_official_verify_type : 0
             * red_official_verified : false
             * userid : 56d6de22aed75858e168d428
             */
            private String images;
            private String nickname;
            private String userid;

            public void setImages(String images) {
                this.images = images;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public void setUserid(String userid) {
                this.userid = userid;
            }

            public String getImages() {
                return images;
            }

            public String getNickname() {
                return nickname;
            }

            public String getUserid() {
                return userid;
            }
        }
    }
}
