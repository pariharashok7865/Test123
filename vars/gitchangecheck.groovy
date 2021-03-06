def gitChange(pathCheck){
    def changeLogSets = currentBuild.changeSets
    for (int i=0; i<changeLogSets.size();i++){
        def entries = changeLogSets[i].items
        for(int j=0;j<entries.length;j++){
            def entry = entries[j]
            if(!entry.msg.contains("[skip ci]"))
            {
                def files=new ArrayList(entry.affectedFiles)
                for(int k=0;k<files.size();k++){
                    def file=files[k]
                    if(file.path.contains(pathCheck)){
                        return true
                    }
                }
            }
        }
    }
}