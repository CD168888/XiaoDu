package com.xiaodu.framework.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.In;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAPI(Swagger3) 接口配置
 *
 * @author
 */
@Configuration
public class SwaggerConfig {

    /**
     * 系统基础配置
     */
    @Autowired
    private RuoYiConfig ruoyiConfig;

    /**
     * 是否开启swagger（可配置在 application.yml）
     */
    @Value("${swagger.enabled:true}")
    private boolean enabled;

    /**
     * 设置请求的统一前缀
     */
    @Value("${swagger.pathMapping:/}")
    private String pathMapping;

    @Bean
    public OpenAPI customOpenAPI() {
        OpenAPI openAPI = new OpenAPI()
                // 基本信息
                .info(new Info()
                        .title("标题：若依管理系统_接口文档")
                        .description("描述：用于管理集团旗下公司的人员信息,具体包括XXX,XXX模块...")
                        .version("版本号:" + ruoyiConfig.getVersion())
                        .contact(new Contact()
                                .name(ruoyiConfig.getName())
                                .url(null)
                                .email(null)
                        )
                );

        if (enabled) {
            // 添加 JWT 认证头
            SecurityScheme securityScheme = new SecurityScheme()
                    .type(Type.APIKEY)
                    .in(In.HEADER)
                    .name("Authorization");

            openAPI
                    .schemaRequirement("Authorization", securityScheme)
                    .addSecurityItem(new SecurityRequirement().addList("Authorization"));
        }

        return openAPI;
    }
}
