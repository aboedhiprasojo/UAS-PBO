/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOSewaBuku;
import IDAO.IDAOSewaBuku;
import Model.TabelSewaBuku;
import Model.mTable;
import View.RentBook;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CRentBook {
    public cRentBook(maingui _tampil){
        this._tampilan = _tampil;
        iDAOSewaBuku = new DAOSewaBuku();
    }
    
        public void IsiTable(){
      list_sewaBuku = iDAOSewaBuku.GetAll();
      TabelSewaBuku tabelSewaBuku = new TabelSewaBuku(list_sewaBuku);
      _tampilan.GetTabelData().setModel(tabelSewaBuku);
        
    }
       
       maingui _tampilan;
       IDAOSewaBuku iDAOSewaBuku;
       List<mTable> list_sewaBuku;
}
