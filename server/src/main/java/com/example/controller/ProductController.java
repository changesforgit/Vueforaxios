package com.example.controller;

import com.example.entity.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    public static ArrayList<Product> productList = new ArrayList<Product>();
    @RequestMapping(path="/getproductlist",method = RequestMethod.POST)
    public ArrayList<Product> GetProductList(){
        productList.clear();
        productList.add(new Product("01","闪迪 tf卡400g",439f,"https://gd3.alicdn.com/imgextra/i4/3255792261/O1CN011SZZyGmaVMiSx6e_!!3255792261.jpg_400x400.jpg","高速手机卡 class10 100M/S存储卡内存卡"));
        productList.add(new Product("02","X-99XLR平衡信号线",1200f,"https://gd4.alicdn.com/imgextra/i1/0/TB16MjadMjN8KJjSZFgXXbjbVXa_!!0-item_pic.jpg_400x400.jpg","台湾MPS原装进口X-99XLR单晶铜镀银6N音频卡农卡侬三芯平衡信号线"));
        productList.add(new Product("03","西数2tb移动硬盘",739f,"https://gd4.alicdn.com/imgextra/i3/0/O1CN01cTJEAg1feF2k7HGL0_!!0-item_pic.jpg_400x400.jpg","2.5英寸WD西数My Passport 2tb移动硬盘2t USB3.0高速加密硬盘"));
        productList.add(new Product("04","闪迪相机卡",1200f,"https://img.alicdn.com/imgextra/i4/2329931089/O1CN01AACbli1JunnZClUks_!!2329931089.jpg_430x430q90.jpg","闪迪cf卡存储卡 Extreme Pro超极速 128g高清4K 160M/S 相机卡"));
        productList.add(new Product("05","闪迪cf卡存储卡",739f,"https://gd3.alicdn.com/imgextra/i3/3081108965/TB2SZgic4AlyKJjSZFyXXbm_XXa_!!3081108965.jpg_400x400.jpg","闪迪cf卡存储卡 Extreme Pro超极速 128g高清4K 160M/S 相机卡"));
        productList.add(new Product("06","铜彩 维特喇叭线",420f,"https://gd1.alicdn.com/imgextra/i1/1684659058/TB2T1bEcpXXXXXsXpXXXXXXXXXX_!!1684659058.jpg","Copper Colour/铜彩 维特喇叭线 HIFI高品质中置线 5.5平方音响线"));
        productList.add(new Product("07","米粒耳机",399f,"https://gd4.alicdn.com/imgextra/i4/2201478282928/O1CN01wvSr7z1XV4FEcHsWu_!!2201478282928.jpg","Mrice/米粒耳机M2蓝牙头戴式耳机便携时尚手机电脑运动耳麦耳机"));
        productList.add(new Product("08","福禄克温湿度计",2088f,"https://gd3.alicdn.com/imgextra/i2/2806809728/O1CN01bCO74X2LjTTPCgpOu_!!2806809728.jpg","福禄克 FLUKE 971 F971温湿度检测仪 温湿度计"));
        productList.add(new Product("09","电容麦克风",502f,"https://gd3.alicdn.com/imgextra/i4/0/O1CN01RlNVa91rjX4jYqTIR_!!0-item_pic.jpg","Takstar/得胜 PC-K500天籁 电容麦克风"));
        productList.add(new Product("10","余氯测试笔",2980f,"https://gd2.alicdn.com/imgextra/i3/2200706044056/O1CN01CNt3AF1fpgzs6sAEq_!!2200706044056.jpg","高精度余氯测试笔泳池余氯检测试剂盒余氯速测盒余氯值测试仪精准"));
        productList.add(new Product("11","无线便携对讲机",568f,"https://gd1.alicdn.com/imgextra/i1/13069349/O1CN01zrCRpw2IvtNjAgiRZ_!!13069349.jpg","Dreamwave VENTURE无线便携对讲机可达3KM户外多功能蓝牙音响"));
        productList.add(new Product("12","苏泊尔 SWF17S11B电热水壶",798f,"https://gd1.alicdn.com/imgextra/i2/0/O1CN01XlCSyh1chxPlNVW79_!!0-item_pic.jpg","SUPOR/苏泊尔 SWF17S11B电热水壶调温保温壶家用烧水壶不锈钢内胆"));
        return productList;
    }
}
