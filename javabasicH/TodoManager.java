package javabasicH;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class TodoManager {
    static ArrayList<String> todoList = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        // 프로그램 시작시 파일 내용 읽어서 todoList에 저장

        loadTodoFile();
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 메뉴 출력
            System.out.println("\n==== 할일 관리 프로그램 ====");
            System.out.println("1.할 일 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 할 일 수정");
            System.out.println("4. 할 일 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("메뉴선택");
            String choice = sc.nextLine();
            
            switch (choice) {
                case "1":
                    showTodos();
                    break;

                case "2":
                    addTodos(sc);
                    break;

                case "3":
                    editTodos(sc);
                    break;

                case "4":
                    deleteTodos(sc);
                    break;
                
                case "5":
                    saveTodoFile(); // 종료전 파일 저장
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력 했습니다. 1~5중 선택하세요. ");
            }

        }
            
    }

    //파일 데이터 로드
    private static void loadTodoFile(){
        try {
            File file = new File("todo.txt");
            if(!file.exists()){
                file.createNewFile();
                return;
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line; // 파일에서 읽은 한 줄 저장 변수 선언
            while((line = reader.readLine()) !=null){
                todoList.add(line);
            }
            reader.close(); // BuffereReader 자원 해제
        } catch (IOException e) {
            System.out.println("파일 일기 중 오류 발생!");
            
        }
    }
    //파일 저장
    private static void saveTodoFile(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("todo.txt"));
            for(String todo: todoList){
                writer.write(todo);
                writer.newLine(); // 줄바꿈 추가
            }
        } catch (IOException E) {
            System.out.println("파일 저장 중 오류 발생!");
        }
    }

    //목록 보기
    private static void showTodos(){
        System.out.println("\n=== 할 일 목록 ===");
        if(todoList.isEmpty()){
            System.out.println("등록된 할 일이 없습니다.");
            return;
        }
        for(int i = 0; i < todoList.size(); i++){
            System.out.println((i+1)+". "+todoList.get(i));
        }
    }

    //할 일 추가
    private static void addTodos(Scanner sc){
        System.out.print("새 할 일 입력 : ");
        String text = sc.nextLine();
        String dateTime = LocalDateTime.now().format(formatter);
        todoList.add(dateTime + " | " + text);
        System.out.println("추가 완료!!!!");
    }

    //수정 메서드
    private static void editTodos(Scanner sc){
        showTodos();
        if( todoList.isEmpty()){
            return;
        }
        System.out.print("수정할 번호 입력: ");
        String input = sc.nextLine();
        try {
            int index = Integer.parseInt(input)-1;
            if( index < 0 || index >= todoList.size()){
                System.out.println("잘못된 번호 입니다.");
                return;
            }
            System.out.println("현재 내용 : "+todoList.get(index));
            System.out.print("새로운 내용 입력 : ");
            String newText = sc.nextLine();
            String newDate = LocalDateTime.now().format(formatter);
            todoList.set(index, newDate + " | "+newText);
            System.out.println("수정완료");

        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
        }
    }

    //할 일 삭제
    private static void deleteTodos(Scanner sc) {
        showTodos();
        if(todoList.isEmpty()){
            return;
        }
        System.out.print("삭제할 번호 입력");
        String input = sc.nextLine();
        try {
            int index = Integer.parseInt(input)-1;
            if( index < 0 || index >= todoList.size()){
                System.out.println("잘못된 번호 입니다.");
                return;
            }
            todoList.remove(index);
            System.out.println("삭제 완료!!");

        } catch (NumberFormatException e) {
            System.out.println("올바른 숫자를 입력하세요.");
        }
    }
}
