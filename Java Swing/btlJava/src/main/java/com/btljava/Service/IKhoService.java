/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.Service;

import com.btljava.model.kho;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IKhoService {
    public boolean insert(kho kh) throws Exception;
    
    public boolean update(kho kh) throws Exception;
    
    public boolean delete(String kh) throws Exception;
    
    public List<kho> findAll() throws Exception;
    
    public List<kho> timkiem(String s) throws Exception;
    
    public kho findAllid(int s) throws Exception;
    public List<kho> hienthi(int id) throws Exception;
}
