package com.cloud.sns.generation.gain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 
 * @ClassName net.sns.generation.gain.GenUtil
 * @description
 * @author : spencer
 * @Create Date : 2014-3-14 上午11:22:09
 */
public class GenUtil extends JdbcDaoSupport {
    private static ApplicationContext applicationContext;
    static {
        applicationContext = new ClassPathXmlApplicationContext("gain/gainContext.xml");
    }

    public static void main(String[] args) throws Exception {
        try {
            // myBatis自动生成代码
            System.out.println("++++ myBatisGenService start +++++ ");
            MybatisGenService gs = (MybatisGenService) applicationContext.getBean("myBatisGenService");
            gs.gen();

            System.out.println("++++ myBatisGenService end ++++++");

            // iBatis自动生成代码
            /*
             * IbatisGenService igs = (IbatisGenService) applicationContext
             * igs.getBean("iBatisGenService"); igs.gen();
             */

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
