##YML  注意点

1. Map/List读取时不能通过@Value的形式进行读取，只能通过（例Person），然后直接注入对象。具体原因还没有找到。

##Properties 注意点
1. 读取中文时会乱码  
2. 在读取Map和List的时候，prefix格式和直接读取不太一样

