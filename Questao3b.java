public int tipoTriangulo(){
       
 if(ladoa != ladob && ladob != ladoc && ladoc != ladoa){
            	return 1;
        }
if(ladoa == ladob || ladoa == ladoc){
return 2;
}	

if(ladoa == ladob && ladoa == ladoc){
return 3;
}	

    return 0;
    }
