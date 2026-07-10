import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.grpc.api.GetActionByHashRequest;
import com.github.iotexproject.grpc.api.GetActionsRequest;
import com.github.iotexproject.grpc.api.GetActionsResponse;

public class Main {
    public static void main(String[] args) {
        RPCMethod rpcMethod = new RPCMethod("api.iotex.one:443", true, 1);

        GetActionsResponse response = rpcMethod.getActions(
                GetActionsRequest.newBuilder().setByHash(GetActionByHashRequest.newBuilder().setActionHash("0f4dd0fbd378a3049916afd0467235ec5919bfca6708d69781f812481c2908cf").build()).build()
        );

        System.out.println(response.getActionInfo(0).getAction().getCore().getGasPrice());
        System.out.println(response.getActionInfo(0).getAction().getCore().getGasLimit());
    }
}
