/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.Service;

import com.btljava.model.nhataitro;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface INhaTaiTroService {
    public boolean insert(nhataitro ntt) throws Exception;
    
    public boolean update(nhataitro ntt) throws Exception;
    public boolean delet(String ntt) throws Exception;
    
    public List<nhataitro> findAll() throws Exception;
    
    public List<nhataitro> timkiem(String s) throws Exception;
    
    public nhataitro findbyid(int s) throws Exception;
    
    public nhataitro findbyntt(String s) throws Exception;
}
