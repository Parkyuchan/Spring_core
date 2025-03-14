package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@Component 어노테이션 붙은 컴포넌트 스캔, 스프링부트 쓰면 쓸 필요 없음
        basePackages = "hello.core", // hello/core 경로 아래 있는 컴포넌트만 스캔, 스캔 속도 많이 줄여준다, 여러 개 지정 가능
        basePackageClasses = AutoAppConfig.class,   //지정하지 않으면 디폴트로 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //@Configuration 붙은 설정 정보도 자동으로 등록되기 때문에 제외(AppConfig, TestConfig)
public class AutoAppConfig {

}
