import Foundation

@objc public class Printpage: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
