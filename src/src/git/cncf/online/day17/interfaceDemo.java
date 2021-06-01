package git.cncf.online.day17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解放的位置，FILKED（属性的位置）
@Target(ElementType.FIELD)
//什么时候生效SOURCE（编译时生效）
@Retention(RetentionPolicy.SOURCE)
public @interface interfaceDemo {

}
