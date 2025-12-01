package magazzino;

import java.io.*;
import java.util.StringTokenizer;

public class MagazzinoUtil {

    public Magazzino caricaDaFileSer(String percorso){
        Magazzino mag = new Magazzino();
        try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream(percorso))){

            Materiale m=(Materiale) ois.readObject();
            mag.addMateriale(m);
            while(m != null){
                m=(Materiale) ois.readObject();
                mag.addMateriale(m);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return mag;

    }

    public void salvaSuFileSer(String percorso,Magazzino mag){
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(percorso))){
            for(Materiale m: mag)
            oos.writeObject(mag);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public Magazzino caricaDaFile(String percorso){
        try(BufferedReader br = new BufferedReader(new FileReader(percorso))){
            StringTokenizer st= new StringTokenizer(br.readLine(),"#");
            Magazzino mag=new Magazzino();


                    
            while (st.hasMoreTokens()){
                StringTokenizer st2=new StringTokenizer(st.nextToken(),"$");

                try{
                String nome = st2.nextToken();
                int qta = Integer.parseInt(st2.nextToken());
                double costo = Double.parseDouble(st2.nextToken());

                Materiale m=new Materiale(nome,qta,costo);
                mag.addMateriale(m);
                }
                catch (Exception e){
                    System.out.println("errore");
                }
            }
            return mag;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void salvaSuFile(String percorso, Magazzino m){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(percorso))){
            for(Materiale mat: m){
                bw.write(mat.stampa());
                bw.write("#");
            }
        } catch (FileNotFoundException fne){

        } catch (IOException ioe){

        }
    }
}
