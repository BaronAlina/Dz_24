package nomer4;

public class Passwork2 {

        public boolean prov1 (String s) {
            boolean b;
            if (s.length() >= 8) {
                return b = true;
            } else {
                return b = false;
            }
        }
            public boolean prov2(char[] ar, String s){
                boolean bukva = false;
                boolean cifra = false;
                int i;
                for (i=0; i<s.length(); i++){
                    if (Character.getType(ar[i])==9){
                        cifra = true;
                    }else{
                        if((Character.getType(ar[i])==1) || (Character.getType(ar[i])==2)){
                            bukva = true;
                        }
                    }
                }
                if (cifra==true && bukva==true){
                    return true;
                }else{
                    return false;
                }
            }

            public String prov3(char[] ar, String s){
            for (int i=0; i<s.length(); i++){
                if ((ar[i]>64 && ar[i]<91) || (ar[i]>96 && ar[i]<123)){
                    return "Ok";
                }else{
                    return "Error";
                }
            }
            return "";
            }
    }
