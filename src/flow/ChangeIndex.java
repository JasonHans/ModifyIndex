package flow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*------ChangeIndex-------
 * 
 * 修改原来的 time bin为：
 *       1 2 3 4 5 ... 
 * 
 * */
public class ChangeIndex {

		//原数据为电信数据
		public static void modifyIndex(String inPath, String outPath){
			//读取文件并修改
			int index = 1;
			StringBuilder content = new StringBuilder("");
			try{
				File file = new File(inPath);
				if(file.isFile() && file.exists()){
					
					String lineText = null;
					
					InputStreamReader read = new InputStreamReader(new FileInputStream(file));
					BufferedReader br = new BufferedReader(read);
					
					while((lineText = br.readLine())!=null){
						
						String array[] = lineText.split(" ");
						array[6] = String.valueOf(index);
						
						String newString = new String("");
						for(int i=0;i<array.length;i++){
							newString += array[i] + " ";
						}
						
						content.append(newString);
						content.append("\t\n");
						
						index++;
					}
					read.close();
				}else{
					System.out.println("找不到指定的文件！");
				}
			}
			catch(Exception e){
				System.out.println("读取文件出错！");
				e.printStackTrace();
			}
			
			//写文件
			try{
				
				File file = new File(outPath);
				if(!file.exists()){
					file.createNewFile();
				}
				
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content.toString());
				bw.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//原数据为校园网数据
		public static void modifyIndex24(String inPath, String outPath){
			//读取文件并修改
			int index = 1;
			StringBuilder content = new StringBuilder("");
			try{
				File file = new File(inPath);
				if(file.isFile() && file.exists()){
					
					String lineText = null;
					
					InputStreamReader read = new InputStreamReader(new FileInputStream(file));
					BufferedReader br = new BufferedReader(read);
					
					while((lineText = br.readLine())!=null){
						
						String array[] = lineText.split(" ");
						array[8] = String.valueOf(index);
						
						String newString = new String("");
						for(int i=0;i<array.length;i++){
							newString += array[i] + " ";
						}
						
						content.append(newString);
						content.append("\t\n");
						
						index++;
					}
					read.close();
				}else{
					System.out.println("找不到指定的文件！");
				}
			}
			catch(Exception e){
				System.out.println("读取文件出错！");
				e.printStackTrace();
			}
			
			//写文件
			try{
				
				File file = new File(outPath);
				if(!file.exists()){
					file.createNewFile();
				}
				
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content.toString());
				bw.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		public static void main(String args[]){
			
			ChangeIndex.modifyIndex24("C:/Users/jason/Desktop/ExData/TTHE-size/inner-1", 
					"C:/Users/jason/Desktop/ExData/TTHE-size/inner-1-C");
			System.out.println("SUCCESS");
		}
}
