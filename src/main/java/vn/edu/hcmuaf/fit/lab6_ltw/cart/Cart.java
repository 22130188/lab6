package vn.edu.hcmuaf.fit.lab6_ltw.cart;

import vn.edu.hcmuaf.fit.lab6_ltw.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Cart {
    Map<Integer, CartProduct> data = new HashMap<>();

    public boolean add(Product p){

       if(data.containsKey(p.getId())){
            update(p.getId() ,data.get(p.getId()).getQuantity()+1);
           return true;
       }
       data.put(p.getId(), convert(p));
       return true;
    }

    public boolean remove(int id){
        return data.remove(id)!= null;
    }

    public List<CartProduct> list(){
        return  new ArrayList<>(data.values());
    }

    private  boolean update(int id, int quantity){
        if(!data.containsKey(id)) return  false;
        CartProduct cp = data.get(id);
        cp.setQuantity(quantity);
        return true;
    }

    public int getTotalQuantity(){
        AtomicInteger i = new AtomicInteger(0);
        data.forEach((k,v) -> i.addAndGet(v.getQuantity()));
     return i.get();
//        return data.values().stream().mapToInt(CartProduct::getQuantity).sum();
    }


    public  Double getTotal(){
        AtomicReference<Double> d = new AtomicReference<>(0.0);
        data.values().forEach(cp -> d.updateAndGet(v -> (double) (v+(cp.getQuantity() + cp.getPrice()))));
        return d.get();
    }


    private CartProduct convert(Product p){
        CartProduct re = new CartProduct();
        re.setId(p.getId());
        re.setTitle(p.getTitle());
        re.setPrice(p.getPrice());
        re.setImg(p.getImg());
        re.setQuantity(1);
        return  re;
    }


}
