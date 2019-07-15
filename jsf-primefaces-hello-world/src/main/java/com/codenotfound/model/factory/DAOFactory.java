package com.codenotfound.model.factory;




public abstract class DAOFactory {
    public static final int ACADEMICS_REPOSITORY = 1;

    public static DAOFactory getDAOFactory(int tipo) {
        switch (tipo) {
	        case ACADEMICS_REPOSITORY:
	            return new AcademicsDaoFactoryImpl();            
	        default:
	            return null;
        }
    }


    

}
