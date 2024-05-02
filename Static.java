
class College {
    static int collegeId = 456;

    {
        System.out.println("College init block " + this);
    }

    static {
        System.out.println("College static block " + College.collegeId);
    }

    College() {
        System.out.println("College constructor " + this);
    }
}

class SGGS extends College {
    static int x = 786;
    static College sggs = new College();
    int y = 2024;

    {
        System.out.println("SGGS init block " + this);
    }

    SGGS() {
        System.out.println("SGGS constructor init block " + this);
    }

    public static void main(String[] args) {
        SGGS s1 = new SGGS();
        System.out.println(s1);
        System.out.println("Inside main: ");
        SGGS s2 = new SGGS();
        System.out.println(s2);
    }

    static {
        System.out.println("Inside SGGS static block");
    }
}














