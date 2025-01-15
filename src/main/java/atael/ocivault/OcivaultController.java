package atael.ocivault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/vault")
public class OcivaultController {

    // This is the name of the secret which value will be grabbed from the OCI Vault
    @Value("${MySuperSecret}")
    private String vaultMySuperSecretValue;

    @GetMapping("/secret")
    public String getMySuperSecretValue() {
        return "The value of My Secret coming from OCI Vault : " + vaultMySuperSecretValue;
    }

}
