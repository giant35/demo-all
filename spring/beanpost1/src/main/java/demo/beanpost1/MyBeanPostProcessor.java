/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.beanpost1;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 *
 * @author tangfanghua
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOG.log(Level.INFO, "postProcessAfterInitialization bean:{0} beanName:{1}", new Object[]{bean.getClass(), beanName});
        return bean;
    }
    private static final Logger LOG = Logger.getLogger(MyBeanPostProcessor.class.getName());

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOG.log(Level.INFO, "postProcessBeforeInitialization bean:{0}\t beanName:{1}", new Object[]{bean.getClass(), beanName});
        return bean;
    }

}
