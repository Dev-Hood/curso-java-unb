package exer_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Times {

	public static void main(String[] args) {
		Map <String, Integer> times = new HashMap<>();
				//time    pontuação
		times.put("santos", 0);
		times.put("corinthias", 3);
		times.put("cruzeiro", 5);
		times.put("vasco da gama", 100);
		times.put("atletico", 2);
		times.put("bahia", 1);
		times.put("palmeiras", 0);
		
		System.out.println(getTeamWithHighestScore(times));

	}
	
	public static String getTeamWithHighestScore(Map<String, Integer> scores) {
		String maior = scores.keySet().iterator().next();
		
		for (Map.Entry<String, Integer> time : scores.entrySet()) {
			if(time.getValue()>scores.get(maior)){
				maior = time.getKey();
			}
		}
	
		return maior;
	}

}
