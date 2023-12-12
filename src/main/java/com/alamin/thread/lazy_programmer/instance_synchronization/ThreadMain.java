package com.alamin.thread.lazy_programmer.instance_synchronization;

public class ThreadMain {
    public static void main(String[] args) {
        InstanceNonStaticPropertySynchronizationResource instanceNonStaticPropertySynchronizationResource = new InstanceNonStaticPropertySynchronizationResource();
        InstanceNonStaticPropertySynchronizationResource instanceNonStaticPropertySynchronizationResource1 = new InstanceNonStaticPropertySynchronizationResource();
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                instanceNonStaticPropertySynchronizationResource.setSynchronizedMethod();
            }
        });
        Thread t2  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    instanceNonStaticPropertySynchronizationResource.getSynchronizedBlock();
                }
            }
        });


        Thread t3  = new Thread(new Runnable() {
            @Override
            public void run() {
                instanceNonStaticPropertySynchronizationResource1.setSynchronizedBlock();
            }
        });
        Thread t4  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    instanceNonStaticPropertySynchronizationResource1.getSynchronizedBlock();
                }

            }
        });
        Thread t5  = new Thread(new Runnable() {
            @Override
            public void run() {
                instanceNonStaticPropertySynchronizationResource.setSynchronizedBlock();
            }
        });
        Thread t6  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    instanceNonStaticPropertySynchronizationResource1.getSynchronizedBlock();
                }

            }
        });
        // ----------------------------------------

//        t1.start();
//        t2.start();

        // ----------------------------------------

//        t3.start();
//        t4.start();

        // ----------------------------------------

//        t5.start();
//        t6.start();

        // ----------------------------------------

        System.out.println("********************************************");
        InstanceStaticPropertySynchronizationResource instanceStaticPropertySynchronizationResource1 = new InstanceStaticPropertySynchronizationResource();
        InstanceStaticPropertySynchronizationResource instanceStaticPropertySynchronizationResource2 = new InstanceStaticPropertySynchronizationResource();
        Thread t7  = new Thread(new Runnable() {
            @Override
            public void run() {
                instanceStaticPropertySynchronizationResource1.setSynchronizedMethod();
            }
        });
        Thread t8  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    instanceStaticPropertySynchronizationResource2.getSynchronizedMethod();
                }

            }
        });
//        t7.start();
//        t8.start();

        System.out.println("**********************************");
        InstancePropertyStaticMethodNonStaticMethodSynchronizationResource instancePropertyStaticMethodNonStaticMethodSynchronizationResource = new InstancePropertyStaticMethodNonStaticMethodSynchronizationResource();
        Thread t9  = new Thread(new Runnable() {
            @Override
            public void run() {
                instancePropertyStaticMethodNonStaticMethodSynchronizationResource.setSynchronizedMethod();

            }
        });
        Thread t10  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    InstancePropertyStaticMethodNonStaticMethodSynchronizationResource.getSynchronizedMethod();
                }

            }
        });
        t9.start();
        t10.start();
    }
}
