package com.fotoable.jkens.service.imp;

import com.fotoable.jkens.dao.BagMapper;
import com.fotoable.jkens.pojo.Bag;
import com.fotoable.jkens.pojo.BagExample;
import com.fotoable.jkens.service.IBagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BagServiceImpl implements IBagService {

    @Autowired
    private BagMapper bagMapper;
    public List<Bag> GetAllBags() {
        BagExample bagExample = new BagExample();
        bagExample.createCriteria().andIdEqualTo("1");

        return bagMapper.selectByExample(bagExample);
    }


    public void InsertNewBag() {
        Bag bag = new Bag();
        bag.setId("1");
        bag.setDes("包1");
        bagMapper.insertSelective(bag);
    }
}
