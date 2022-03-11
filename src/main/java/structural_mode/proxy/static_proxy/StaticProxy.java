package structural_mode.proxy.static_proxy;


class staticProxy {

    interface Marry{
        public void happyMarry();
    }

    //真实结婚的人，实现Marry接口
    static class You implements Marry{

        @Override
        public void happyMarry() {
            System.out.println("我要结婚了！");
        }
    }
    //婚庆公司，实现Marry接口
    static class WeddingCompany implements Marry{

        //代理谁，真实结婚的人target
        private Marry target;

        //婚庆公司的构造方法，构造出一个将要结婚的人target
        public WeddingCompany(Marry target) {
            this.target = target;
        }

        @Override
        public void happyMarry() {
            target.happyMarry();//这个地方就去调用了You类中的happyMarry()方法
        }
        public void before(){
            System.out.println("婚前布置");
        }
        public void after(){
            System.out.println("婚后收钱");
        }
    }

    public static void main(String[] args) {

        WeddingCompany jiehun = new WeddingCompany(new You());
        jiehun.before();
        jiehun.happyMarry();
        jiehun.after();

        new WeddingCompany(new You()).happyMarry();
    }
}




