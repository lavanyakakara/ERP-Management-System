package com.example.erp_managment_system.Controller;
import com.example.erp_managment_system.entity.Inventory;
import com.example.erp_managment_system.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/inventory")
@CrossOrigin("*")
public class InventoryController {
    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }
    @PostMapping
    public Inventory createInventory(
            @RequestBody Inventory inventory){
        return service.saveInventory(inventory);
    }
    @GetMapping
    public List<Inventory> getInventory(){
        return service.getAllInventory();
    }
    @GetMapping("/count")
public long getInventoryCount() {
    return service.getInventoryCount();
}
    @PutMapping("/{id}")
    public Inventory updateInventory(
            @PathVariable Long id,
            @RequestBody Inventory inventory){
        inventory.setInventoryId(id);
        return service.saveInventory(inventory);
    }
    @DeleteMapping("/{id}")
    public String deleteInventory(@PathVariable Long id){
        service.deleteInventory(id);
        return "Inventory Deleted";
    }
}
