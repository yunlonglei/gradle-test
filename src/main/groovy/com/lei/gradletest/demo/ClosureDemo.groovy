package com.lei.gradletest.demo

/**
 * 闭包调用的方法
 * @author leiyunlong
 * @since 2021/12/21 6:14 PM
 * @version 1.0
 */
class ClosureDemo {
    /**
     * main方法
     * @param args
     */
    static void main(String[] args) {
        // 闭包
        def outerClosure = {
            v ->
                print v
        }

        // 这个 outerClosure闭包 作为参数调用ClosureTest这个方法
        ClosureTest {
            outerClosure(123 + "\n")
        }
        ClosureTest {
            outerClosure '12345321\n'
        }
        ClosureTest {
            outerClosure plugin: 'java'
        }
        ClosureTest {
            outerClosure { plugin: 'java' }
        }
    }

    /**
     * ClosureTest 方法
     * @param closure
     */
    static def void ClosureTest(Closure closure) {
        closure()
    }
}
