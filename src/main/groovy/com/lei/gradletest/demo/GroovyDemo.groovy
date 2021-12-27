package com.lei.gradletest.demo

/**
 * Groovy基础知识
 * @author leiyunlong
 * @since 2021/12/27 2:25 PM
 * @version 1.0
 */
class GroovyDemo {
    static void main(def args) {
        // 可选的类型定义-> 不用定义类型，自动(弱类型)
        def version = 1

        // assert语句 [断言:此处应为success，其他值为error]
        assert version == 1

//        // 括号可选
        println(version)
        println version

        // 字符串
        def s1 = 'fsdfsd'
        def s2 = "fafad"   //[可以插入变量${xxxx}，直接解析]
        def s3 = '''afafadf

        asfsdfsdffsdfsdfsdfsdfdf''' //[换行]

        //集合API
        //定义一个list，默认为array list
        def buildTools = ["ant", "maver"]
        //追加
        buildTools << 'dfsdfd'
        //验证
        println buildTools.getClass() == ArrayList // assert
        println buildTools.size() == 3  // assert

        //定义一个map[一定要单引号吗]
        def buildYears = ['ant': 2000, maven: 2004]
        //追加元素
        buildYears.gradle = 2009
        //访问元素【两种形式】
        println buildYears.ant
        //字符串形式访问元素[一定要单引号吗]
        println buildYears['gradle']
        //打印类型[LinkedHashMap]
        println buildYears.getClass()

        //常见gradle闭包形式，当做方法参数
        //箭头后面是 方法体
        def c1 = {
            v ->
                print v
        }
        def c2 = {
            print 'hello\n'
        }

        method1(c1);
        method2(c2);
    }

    //两个使用闭包作为参数的方法
    /**
     * 闭包[代码块，多种使用形式],不要导入java相关自动补全包
     */
    static def method1(Closure closure) {
        closure('param\n')
    }

    /**
     * 不带参数的闭包
     */
    static def method2(Closure closure) {
        closure()
    }
    /**
     * 闭包
     * @param closure
     * @return
     */
    static def method3(Closure closure) {
        closure()
    }
}
