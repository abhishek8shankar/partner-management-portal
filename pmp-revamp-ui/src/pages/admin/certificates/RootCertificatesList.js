import { useNavigate } from 'react-router-dom';
import CertificatesList from "./CertificatesList";

function RootCertificatesList() {
    const navigate = useNavigate('');

    const viewRootCertificateDetails = (selectedCertificateData) => {
        const requiredData = {
            certificateData: selectedCertificateData,
            certType: 'root',
            header: 'viewCertificateDetails.viewRootCaCertificateDetails',
            subTitle: 'rootCertificateList.subTitle',
            backLink: '/partnermanagement/admin/certificates/root-ca-certificate-list'
        }
        localStorage.setItem('selectedCertificateAttributes', JSON.stringify(requiredData));
        navigate('/partnermanagement/admin/certificates/view-root-ca-certificate-details');
    };

    return (
        <CertificatesList
            certificateType='root'
            uploadCertificateBtnName='rootCertificateList.uploadRootCaCertificate'
            subTitle='rootCertificateList.subTitle'
            viewCertificateDetails={viewRootCertificateDetails}
            downloadBtnName='rootCertificateList.downloadCertificate'
        />
    )
}

export default RootCertificatesList;