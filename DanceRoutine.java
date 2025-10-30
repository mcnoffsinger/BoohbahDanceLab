public class DanceRoutine {
    private Boohbah[] boohbahs;

    DanceRoutine(Boohbah[] ALLIKNOWAREBEES){
        this.boohbahs = ALLIKNOWAREBEES;
    }

    public String BuildRoutine(){
        StringBuilder result = new StringBuilder("");
        for (Boohbah boohbah : boohbahs){
            result.append(boohbah.performMove());
            result.append("\n");


        }
        return result.toString();
    }

    public String ModifyRoutine(){
        StringBuilder result = new StringBuilder("");
        
        for (Boohbah boohbah : boohbahs){
            StringBuilder current = new StringBuilder(boohbah.performMove());
            current.replace(current.indexOf("performs"), current.indexOf("performs")+8,"summons");

            result.append(current.toString());
            result.append("\n");
            


        }
        return result.toString();

    }
    public String remixRoutine(){
        StringBuilder baseText = new StringBuilder(this.BuildRoutine());
        baseText.insert(0, "\n---REMIX---\n");
        baseText.delete(baseText.length()-1,baseText.length() );
        baseText.append("\n(Backwards Boohbah ritual!)\n");
        baseText.reverse();
        
        return baseText.toString();

    }
}
