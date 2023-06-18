package com.oxal.jwaven.web.api;

import com.oxal.jwaven.common.entity.AbstractWavenEntity;
import com.oxal.jwaven.common.entity.finalentity.ResourceWaven;
import com.oxal.jwaven.common.entity.finalentity.SpellWaven;
import com.oxal.jwaven.common.entity.TypeWavenEntity;
import com.oxal.jwaven.common.file.FileHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class SimpleController {
    @Autowired
    private FileHelper fileHelper;
    @GetMapping("/spell")
    @ResponseBody
    public SpellWaven spell(@RequestParam Long id) throws IOException {
        return fileHelper.openWavenFile(TypeWavenEntity.SPELL, id, SpellWaven.class).orElse(null);
    }
    @GetMapping("/resource")
    @ResponseBody
    public AbstractWavenEntity resource(@RequestParam Long id) throws IOException {
        return fileHelper.openWavenFile(TypeWavenEntity.RESOURCE, id, ResourceWaven.class).orElse(null);
    }
}
