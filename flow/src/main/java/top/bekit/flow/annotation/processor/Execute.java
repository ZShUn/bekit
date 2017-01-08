/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2016-12-17 17:46 创建
 */
package top.bekit.flow.annotation.processor;

import java.lang.annotation.*;

/**
 * 业务处理（必需要素）
 * <p>
 * 此注解对应的方法返回值会作为处理器的返回值返回给流程节点。
 * 可以无入参；有入参的话，则必须是TargetContext类型；对于返回参数类型的话只要是能被赋值给流程节点的下个节点选择方法的入参就行
 * （比如：String execute(TargetContext targetContext)）
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Execute {
}
