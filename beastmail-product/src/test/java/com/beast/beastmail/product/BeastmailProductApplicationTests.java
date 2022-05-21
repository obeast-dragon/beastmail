//package com.beast.beastmail.product;
//
//import com.aliyun.oss.*;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.beast.beastmail.product.entity.BrandEntity;
//import com.beast.beastmail.product.service.BrandService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.List;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class BeastmailProductApplicationTests {
//
//    @Autowired
//    BrandService brandService;
//
//    @Resource
////    OSSClient ossClient;
//
//    //原生oss上传文件
//    @Test
//    public void testUpload() throws FileNotFoundException {
////        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
////        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
////        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
////        String accessKeyId = "LTAI5tMT9VUtuZKLMp4bPQSh";
////        String accessKeySecret = "MjLeoSkVVzJsYTfd056y2KEfbvspd1";
//        // 填写Bucket名称，例如examplebucket。
//        String bucketName = "beastmail";
//        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//        String objectName = "556717.jpg";
//        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//        String filePath = "E:\\壁纸\\556717.jpg";
//
//        // 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        InputStream inputStream = new FileInputStream(filePath);
//        // 创建PutObject请求。
////        ossClient.putObject(bucketName, objectName, inputStream);
////        ossClient.shutdown();
//
//        System.out.println("上传完成");
//    }
//
//    @Test
//    public void contextLoads() {
//
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("华为2");
////        brandEntity.setDescript("");
////        brandService.save(brandEntity);
////        brandService.updateById(brandEntity);
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach(System.out::println);
//    }
//
//}
