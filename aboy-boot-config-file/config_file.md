## YML  注意点

1. Map/List读取时不能通过@Value的形式进行读取，只能通过（例Person），然后直接注入对象。具体原因还没有找到。

## Properties 注意点
1. 读取中文时会乱码  
2. 在读取Map和List的时候，prefix格式和直接读取不太一样

## 动态刷新配置文件
1. 在动态修改配置文件时，需要同时引入actuator和config，不然动态效果不会生成
2. 对需要刷新的属性使用@Value注解，同时将类使用@RefreshScope注解进行标记
3. 如果引用属性为static，则需要将@Value方法注解到set方法中，可实现静态数据更换
4. 修改编译的配置文件（注意是编译，在IDE测试时，在target中），再使用POST请求 http://127.0.0.1:10086/actuator/refresh，则可刷新配置

```
    <dependencies>  
        <dependency>  
            <groupId>org.springframework.boot</groupId>  
            <artifactId>spring-boot-starter-web</artifactId>  
        </dependency>  
        <dependency>  
            <groupId>org.springframework.cloud</groupId>  
            <artifactId>spring-cloud-starter-config</artifactId>  
        </dependency>   
        <dependency>  
            <groupId>org.springframework.boot</groupId>  
            <artifactId>spring-boot-starter-actuator</artifactId>  
        </dependency>  
    </dependencies>  
    
    <dependencyManagement>
        <dependencies>
          <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>Finchley.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
          </dependency>
        </dependencies>
      </dependencyManagement>
```