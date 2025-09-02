<#-- Controller类Freemarker模板 -->
package ${package.Controller};

<#list importControllerPackages as pkg>
import ${pkg};
</#list>
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ${superControllerClassPackage};

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@RestController
@RequestMapping("<#if package.ModuleName??>/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
public class ${table.controllerName} extends ${superControllerClass} {

}
