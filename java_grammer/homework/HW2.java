package java_grammer.homework;

import java.util.*;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ds = sc.nextLine();//자료구조명
        String title = sc.nextLine(); //제목

        int i = 1;
        switch (ds.toLowerCase()) {
            case "set" -> {
                Set<String> set = new LinkedHashSet<>();
                while (true) {
                    String recipe = sc.nextLine();
                    if (Objects.equals(recipe,"끝"))
                        break;
                    set.add(i + " " + recipe);
                    i++;
                }
                System.out.println("[ " + ds + " 으로 저장된 " + title + " ]");
                for (String s : set) {
                    System.out.println(s);
                }
                break;
            }
            case "list" -> {
                List<String> list = new ArrayList<>();
                while (true) {
                    String recipe = sc.nextLine();
                    if (Objects.equals(recipe,"끝"))
                        break;
                    list.add(i + " " + recipe);
                    i++;
                }
                System.out.println("[ " + ds + " 로 저장된 " + title + " ]");
                for (String s : list) {
                    System.out.println(s);
                }
                break;
            }
            case "map" -> {
                Map<Integer, String> map = new HashMap<>();
                while (true) {
                    String recipe = sc.nextLine();
                    if (Objects.equals(recipe,"끝"))
                        break;
                    map.put(i, i + " " + recipe);
                    i++;
                }
                System.out.println("[ " + ds + " 으로 저장된 " + title + " ]");
                for (String s : map.values()) {
                    System.out.println(s);
                }
                break;
            }
            default->{
                System.out.println("저장할 수 없는 자료구조 입니다.");
            }
        }
    }
}
