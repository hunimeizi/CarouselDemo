#Carousel
######利用Glide实现轮播图片功能
        List<String> adList = new ArrayList<>();
        adList.add("http://pic.nipic.com/2008-01-05/200815191150944_2.jpg");
        adList.add("http://pic1.nipic.com/2009-02-19/200921922311483_2.jpg");
        adList.add("http://pic.nipic.com/2008-04-30/2008430112252842_2.jpg");
        slideShowView.setImageUris(this, adList, imageCycleViewListener);
######添加几张图片就显示几张图片进行轮播