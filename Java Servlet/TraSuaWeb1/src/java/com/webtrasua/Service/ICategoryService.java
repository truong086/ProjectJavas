/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Service;

import com.webtrasua.model.category;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ICategoryService {
    public boolean insert(category ca) throws Exception;
    public boolean edit(category ca) throws Exception;
    public boolean delete(String ca) throws Exception;
    public List<category> findAll() throws Exception;
    public category findOne(int id) throws Exception;
}
