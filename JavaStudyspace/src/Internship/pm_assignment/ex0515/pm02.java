package Internship.pm_assignment.ex0515;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pm02 {

	
	/*
		땅위에 달팽이가 있따. 이 달팽이는 높이가 V미터인 나무막대를 올라갈것이다.
		달팽이는 낮에 A미터 올라갈수있다. 하지만, 밤에 잠을 자는동안 B미터 미끄러진다.
		또, 정상에 올라간후에는 미끄러지지않는다.
		달팽이가 나무막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
		
		첫째줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다
		(1 ≤ B < A ≤ V ≤ 1,000,000,000)
		
		[input]
		2 1 5
		[output]
		4
	  
	 */
	
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.print("달팽이가 낮에 올라가는 미터, 잠을 자는동안 미끄러지는 미터, 전체 막대길이를 입력하세요 : ");
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
  
        int day = day = (V - B)/(A - B);
        
        if((V - B)%(A - B)!= 0) day++;
        
        bw.write(day + "일 걸립니다");
        
        bw.flush();
        br.close();
        bw.close();
    }		
}
