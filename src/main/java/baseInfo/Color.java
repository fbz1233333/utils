package baseInfo;

public enum Color {

    BLUE("蓝色",1),GREEN("绿色",2),WHITE("白色",3);

    String name;
    Integer index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    Color(String s, Integer i) {
        this.name=s;
        this.index=i;
    }
}
