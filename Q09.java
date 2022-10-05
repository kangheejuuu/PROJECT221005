import java.util.Scanner;

interface Stack {
	   int length(); // 현재 스택에 저장된 개수 리턴
	   int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	   String pop(); // 스택의 톱(top)에 실수 저장
	   boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
	}

public class Q09 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int len = sc.nextInt();
        StringStack st = new StringStack(len);
        
        while(true) {
            System.out.print("문자열 입력 >> ");
            String val = sc.next();
            if(val.contentEquals("그만")) {
                break;
            }
            if(!st.push(val)) {
                System.out.println("스택이 곽차서 푸시 불가!");
            }
        }
        
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for(int i=0; i<st.length(); i++) {
            System.out.print(st.pop()+" ");
        }
    }
}
class StringStack implements Stack{
    private int top;
    private String[] stack;
    private int len;    //스택 크기
    private int poss;    //지금 들어찬게 몇번짼지
    
    StringStack(int len){
        this.len = len;
        stack = new String[len];    //스택 크기만큼 배열 생성
        top = -1;    //지금 꼭대기는 -1;
        poss=0;
    }
    @Override
    public int length() {
        // TODO Auto-generated method stub
        return poss;    // 지금 들어차있는 수
    }
 
    @Override
    public int capacity() {
        // TODO Auto-generated method stub
        return len;
    }
 
    @Override
    public String pop() {    //스택의 top에 실수 저장
        // TODO Auto-generated method stub
        if(top == -1) {
            System.out.println("스택이 비어있습니다.");
        }
        String s = stack[top];
        top--;    //pop해서 배열에 있는 값을 뻈으니 (실제로는 들어있고 삭제하지 않았습니다. top이 가리키는 변수가 하나 줄어들뿐)
        return s;
    }
 
    @Override
    public boolean push(String val) {    // 스택의 top에 저장된 실수 리턴
        if(poss == len) {
            return false;
        }else {
            top++;
            poss++;    //저장 됐으니까 poss올림
            stack[top] = val;
            return true;
        }
        
        
        
    }
    
}